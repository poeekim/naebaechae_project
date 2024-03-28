package controller;

import java.io.*;//FileInputStream
import java.util.*;//Map,Properties
import javax.servlet.*;
import javax.servlet.http.*;
//추가->다른 패키지의 클래스나 인터페이스를 참조
import action.CommandAction;


public class ControllerAction
        extends HttpServlet {

    //명령어와 명령어 처리클래스를 쌍으로 저장
    private Map commandMap = new HashMap();

    //서블릿을 실행시 서블릿의 초기화 작업->생성자
    public void init(ServletConfig config)
            throws ServletException {

        //경로에 맞는 CommandPro.properties파일을 불러옴
        String props = config.getInitParameter("propertyConfig");
        System.out.println("불러온경로="+props);

        //명령어와 처리클래스의 매핑정보를 저장할
        //Properties객체 생성
        Properties pr = new Properties();
        FileInputStream f = null;//파일불러올때

        try {
            //CommandPro.properties파일의 내용을 읽어옴
            f=new FileInputStream(props);

            //파일의 정보를 Properties에 저장
            pr.load(f);

        }catch(IOException e){
            throw new ServletException(e);
        }finally{
            if(f!=null) try{f.close();}catch(IOException ex){}
        }

        //객체를 하나씩 꺼내서 그 객체명으로 Properties
        //객체에 저장된 객체를 접근
        Iterator keyiter = pr.keySet().iterator();

        while(keyiter.hasNext()){
            //요청한 명령어를 구하기위해
            String command = (String)keyiter.next();
            System.out.println("command="+command);
            //요청한 명령어(키)에 해당하는 클래스명을 구함
            String className=pr.getProperty(command);
            System.out.println("className="+className);

            try{
                //그 클래스의 객체를 얻어오기위해 메모리에 로드
                Class commandClass = Class.forName(className);
                System.out.println("commandClass="+commandClass);
                Object commandInstance = commandClass.newInstance();
                System.out.println
                        ("commandInstance="+commandInstance); // list.do

                //Map객체 commandMap에 저장
                commandMap.put(command, commandInstance);
                System.out.println("commandMap="+commandMap);

            } catch (ClassNotFoundException e) {
                throw new ServletException(e);
            } catch (InstantiationException e) {
                throw new ServletException(e);
            } catch (IllegalAccessException e) {
                throw new ServletException(e);
            }
        }//while
    }

    public void doGet(//get방식의 서비스 메소드
                      HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        requestPro(request,response);
    }

    protected void doPost(//post방식의 서비스 메소드
                          HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        requestPro(request,response);
    }

    // 사용자의 요청을 분석해서 해당 작업을 처리
    //시용자의 요청을 분석해서 해당 작업을 처리
    private void requestPro(HttpServletRequest request,
                            HttpServletResponse response)
            throws ServletException, IOException {

        String view=null;//요청명령어에 따라서 이동할 페이지정보(/list.do->/list.jsp)
        // /list.do=action.ListAction  ->ListAction com=new ListAction()
        // /writeForm.do=action.WriteFormAction
        //  WriteFormAction com=new WriteFormAction();
        CommandAction com=null;//요청받아서 처리해주는 자식클래스 객체선언
        //부모 어떠한 자식클래스의 객체라도 부모형으로 형변환
        // CommandAction com=new ListAction();
        try {
            //1.요청명령어 분리(/JspBoard2/list.do)
            //                    /JspBoard2
            String command=request.getRequestURI();
            System.out.println("request.getRequestURI()=>"+request.getRequestURI());
            //System.out.println("request.getContextPath()=>"+request.getContextPath()); // 기져오질 못하네...
            // /JspBoard2
            //if(command.indexOf(request.getContextPath())==0) {
               // command=command.substring(request.getContextPath().length());
            command=command.substring(10);
            System.out.println("실질적인 command명령어->"+command); // /list.do
          //  }
            // 요청명령어->명령어 처리클래스 객체을 얻어오자->requestPro()호출->DAO의 메서드호출
            com=(CommandAction)commandMap.get(command);
            System.out.println("com=>"+com);// action.ListAction@주소값
            view=com.requestPro(request, response);
            System.out.println("view=>"+view);// view=>/list.jsp
        }catch(Throwable e) {
            throw new ServletException(e);
        }
        //위에서	요청명령어에 해당하는 view로 데이터를 공유시키면서 이동->forward() 메서드
        RequestDispatcher dispatcher=request.getRequestDispatcher(view);// /list.jsp
        dispatcher.forward(request, response);//공유해서 이동시킨다.

    }
    /*
    // 사용자의 요청을 분석해서 해당 작업을 처리
    private void requestPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String view = null; // 요청 명령어에 따라서 이동할 페이지 정보(/list.do -> /list.jsp)
        // list.do = action.ListAction -> ListAction com = new ListAction()
        // /writeForm.do = action.WriteFormAction
        // WriteFormAction com = new WriteFormAction();
        CommandAction com = null; // 요청받아서 처리해주는 자식클래스 객체선언

        // 부모의 어떠한 자식클래스의 객체라도 부모형으로 형변환 한다.
        // CommandAction com = new ListAction();

        try {
            // 1. 요청 명령어 분리(모델1 에서는 /JspBoard2/list.jsp로 불럿지만, 모델2에서는 직접적으로 jsp 를 불러올 수 없으니, 필요한 부분만 split 으로 뜯어온다.
            String command = request.getRequestURI(); //        JspBoard2/list.do
            System.out.println("command = " + command);
            // 2. 프로젝트명만 뽑기 (/JspBoard2/list.do 에서 일치하는 프로젝트명만 제외하면 /list.do 를 얻어낼 수 있음)
            System.out.println("request.getContextPath = " + request.getContextPath()); // /JspBoard2
            if (command.indexOf(request.getContextPath())==0){
                command = command.substring(request.getContextPath().length()); // /list.do
                System.out.println("실질적인 command 명령어 : " + command);
            }
            // 요청 명령어 -> 명렁어 처리 클래스 객체를 얻어와야  실질적인 DAO 메소드 호출이 가능한 requestPro() 를 호출 할 수 있다.
            com = (CommandAction) commandMap.get(command);
            System.out.println("com = " + com); // action.ListAction@주소값
            view = com.requestPro(request, response);
            System.out.println("view = " + view);

        } catch (Throwable e) {
            throw new ServletException(e);
        }
        // try 에서 선언한 요청 명령어에 해당하는 view 로 데이터를 공유시키면서 이동 -> forward() 메소드를 사용해야함.
        RequestDispatcher dispatcher = request.getRequestDispatcher(view); //   forward 메소드를 사용하기 위해 RequestDispatcher 객체를 선언.   /list.jsp 가 들어감.
        dispatcher.forward(request, response);



    }

     */
}

