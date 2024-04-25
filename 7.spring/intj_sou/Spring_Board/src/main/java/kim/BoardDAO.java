package kim;

import java.sql.*; // Connection 객체를 위함
import java.util.*; // ArrayList 객체를 위함

// JNDI 관련 //
import javax.sql.*; // DataSource 객체를 얻기 위함(getConnection())
import javax.naming.*; // Context 객체(인터페이스) or InitialContext(클) -> lookup(찾고자 하는 이름)



public class BoardDAO{

	private DBConnectionMgr pool = null;
	private Connection con = null;
//	DataSource ds; // DBConnectionMgr pool 대신에 쓰임


   public BoardDAO(){
		// 생성자 : DataSource		|	얻기 : InitialContext 와 JNDI 명

	   try {
		   // InitialContext ctx = new InitialContext() ; 와 같지만, Context ctx 로 진행하는 것이 추후 수정시 더 편함.
/*		   Context ctx = new InitialContext();

		   // 표현식) lookup("java:comp/env/찾고자하는 JNDI명")
		   ds = (DataSource) ctx.lookup("java:comp/env/jdbc/orcl");
		   System.out.println("ds = " + ds);*/
		   pool = DBConnectionMgr.getInstance();
		   System.out.println("pool = " + pool);


	   } catch (Exception e) {
		   e.printStackTrace();
	   }
   }


	public ArrayList  list(){  // 글 목록 보기
		
		ArrayList list = new ArrayList();
		try{
			con= pool.getConnection();
			System.out.println("con=>"+con);
			String sql = "SELECT * FROM springboard ORDER BY num desc";
//			Connection con = ds.getConnection();

			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			System.out.println("rs = " + rs);
			while(rs.next()){
				Board data = new Board();
				data.setNum( rs.getInt( "num" ) );
				data.setAuthor(rs.getString( "author" ));
				data.setTitle(rs.getString( "title"));
				data.setContent(rs.getString( "content" ));
				data.setDate(rs.getString( "writeday" ));
				data.setReadcnt(rs.getInt( "readcnt" ));
				list.add( data );
			}//end while
			rs.close();	stmt.close(); con.close();
		}catch(Exception e){ e.printStackTrace(); }

		System.out.println("list = " + list);
		return  list;

	}//end list



	/* --------------------------------------------------------- */

	public int getNewNum(){ //글쓰기 번호 얻기(중복 X)
		int newNum=1;//저장할 게시물번호 디폴트 설정값 1
		try {
			con= pool.getConnection();
			String sql="select max(num) from springboard";//0,1,2,3,+1
//			Connection con=ds.getConnection();
			PreparedStatement stmt=con.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery(sql);
			if(rs.next()) {
				newNum=rs.getInt(1)+1;//최대값+1=>다음번값
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return newNum;//1 or 1이상
	}//end getNewNum();



	/* ---------------------------글 쓰기----------------------------- */
	public void write(String author, String title , String content){
		try{
			int newNum = getNewNum();
			String sql ="insert into springboard(num,author,title,content) values(";
			sql +=  newNum + ",'" + author + "','" + title + "','" + content + "')";
			System.out.println(sql);

			con= pool.getConnection();
//	  	  	Connection con = ds.getConnection();
	  	  	PreparedStatement stmt = con.prepareStatement(sql);
	  	  	stmt.execute(sql);
	  	  	stmt.close(); con.close();
	  	}catch(Exception e ) {e.printStackTrace();}
	}//end write


	/* -------------------------목록 보기-------------------------------- */
	public Board retrieve(String num){ // 
		Board data = new Board();// 담을 객체 선언

		try {
			// 1. 조회수 증가
			String sql = "update springboard set readcnt = readcnt+1 where num="+num;
			con= pool.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			int update = stmt.executeUpdate(sql); // 반환값이 1이면 성공 | 0 이면 실패

			System.out.println("조회수 증가 유무");
			System.out.println("update = " + update);

			stmt=null; // 초기화.
			sql = "select * from springboard where num=" + num;
			stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				data.setNum(rs.getInt("num"));
				data.setAuthor(rs.getString("author"));
				data.setTitle(rs.getString("title"));
				data.setContent(rs.getString("content"));
			}
			rs.close();
			stmt.close();
			con.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return data;

	}//end retrieve


	/* ---------------------------수정하기------------------------------ */
   // update(Board board) 로 한꺼번에 가져오는 것을 구현할 수 있다. 아래는 하나하나 가져오는 것.
	public void update( String num , String author,
			            String title , String content){ // �� �����ϱ�
	     try{
			 con= pool.getConnection();
		  String sql ="update springboard set title='" + title + "',";
		  sql += " content='" + content+"',";
		  sql += " author ='" + author+"'";
		  sql += " where num=" + num;
		  System.out.println(sql);


//		  Connection con = ds.getConnection();
		  PreparedStatement stmt = con.prepareStatement(sql);  
		  stmt.executeUpdate(sql);
		  stmt.close();  con.close();
			 int update = stmt.executeUpdate(sql);
			 System.out.println("update() 수정유무 : " + update);
	     }catch(Exception e){e.printStackTrace();}
	  }//end update



	/* ----------------------------삭제하기----------------------------- */
	  public void delete( String num){ //�� �����ϱ�

		  try {
			  con= pool.getConnection();
			  String sql ="delete from springboard where num="+num;
			  PreparedStatement stmt = con.prepareStatement(sql);
			  int delete = stmt.executeUpdate(sql); // 반환값이 1이면 성공 | 0 이면 실패

			  System.out.println("delete = " + delete);
		  } catch (Exception e) {
			  throw new RuntimeException(e);
		  }


	  }//end delete


	/* ----------------------------검색 하기----------------------------- */
	  public ArrayList search( String name , String value ){ //�˻��ϱ�
		    ArrayList list = new ArrayList();
		    try{
				con = pool.getConnection();
		  	  String sql = "SELECT * FROM springboard";
			  sql += " WHERE  " + name + " LIKE  '%" + value + "%' "; 
			  System.out.println( sql );
		  
//			      Connection con = ds.getConnection();
		    	  PreparedStatement stmt = con.prepareStatement(sql);
		    	  ResultSet rs = stmt.executeQuery(sql);

		    	  while( rs.next()){
		    		Board data = new Board();
		    		data.setNum(rs.getInt( "num" ));
		    		data.setAuthor(rs.getString( "author" ));
		    		data.setTitle(rs.getString( "title"));
		    		data.setContent(rs.getString( "content" ));
		    		data.setDate(rs.getString( "writeday" ));
		    		data.setReadcnt(rs.getInt( "readcnt" ));
		    		list.add( data );
		    	  }
		    	  rs.close();	stmt.close(); con.close();
		    	}catch( Exception e){ e.printStackTrace();}
		    	return list;
    }
}
