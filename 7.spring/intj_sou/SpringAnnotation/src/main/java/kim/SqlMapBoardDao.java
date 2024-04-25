package kim;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.dao.DataAccessException;

import java.util.List;

public class SqlMapBoardDao extends SqlSessionDaoSupport implements BoardDAO {

    /*
    *  글 목록을 보기 위해서는 Board.xml 내 select 태그를 불러와야함 = SqlSession 객체를 상속을 받아야 한다. ->
    *  SqlSessionDaoSupport 의 메소드 중 getSqlSession() 을 사용해야 하므로 상속받야아함.
    * (만약 상속 받지 않을시, SqlSession 멤버변수를 선언하고 SqlSession 을 Setter Method를 작성하고.. 처리할게 많으므로
    * 간단하게 SqlSessionDaoSupport 를 상속받기로 하자)
    * */

    @Override
    public List list() throws DataAccessException {
        /*
        * select : 레코드 한개만 선택 -> selectOne("실행시킬 sql 구문의 id")
        *        : 레코드 두개 이상 -> selectList("실행시킬 sql 구문의 id")
        * */

        return getSqlSession().selectList("list");
    }

    @Override
    public int getNewNum() throws DataAccessException {
        return getSqlSession().selectOne("getNewNum");
    }

    @Override
    public void write(BoardCommand data) throws DataAccessException {
         //sqlSession 객체 : 메소드 이름이 자동으로 insert("실행시킬sql 구문의 id", 매개변수명);
         getSqlSession().insert("write",data);
    }

    @Override
    public BoardCommand retrieve(int num) throws DataAccessException {
        return (BoardCommand)getSqlSession().selectOne("retrieve",num);
    }

    // 수정하기
    @Override
    public void update(BoardCommand data) throws DataAccessException {
        getSqlSession().update("update",data);
    }

    // 삭제하기
    @Override
    public void delete(int num) throws DataAccessException {
        getSqlSession().delete("delete",num);
    }
    // 검색하기
    @Override
    public List search(BoardCommand data) throws DataAccessException {
        return getSqlSession().selectList("search",data);
    }

    // 조회수 증가
    @Override
    public void updateReadcnt(int num) throws DataAccessException {
        //update태그->형식)sqlSession객체명.update("실행시킬 id",매개변수명)
        getSqlSession().update("updateReadcnt", num); //#{num}
    }
    
    


}
