<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>Title</title>
    <%-- getXml.jsp 를 요청

    	<person>
			<name>홍길동</name>
			<job>학생</job>
			<age>23</age>
	</person>
    --%>
    <script>
        $(function () {
            /*제이쿼리에서 $ 로 시작하는 것은 단독 처리하는 것임.*/
            // $.ajax('경로/요청페이지',{전달할 매개변수},function(data){})
            // $.ajax('getXml.jsp',{key:value},function(data){})
            $.ajax('getXml.jsp',{
                // data: ~  매개변수가 없을시 생략 가능
                success: function (data) {
                    // 파싱 작업(분리작업) parsing -> find() or filter()
                    // for 문 돌려서 $(this)를 불러온다.
                    $(data).find('person').each(function (){
                        let name ='<li>'+ $(this).find('name').text()+'</li>';
                        let job ='<li>'+ $(this).find('job').text()+'</li>';
                        let age ='<li>'+ $(this).find('age').text()+'</li>';

                        // div 와 결합해서 화면에 출력
                        $('#output').append('<ul>' + name + job + age + '</ul>');
                    })
                }, error:function (){
                    alert('서버요청및 파일 불러오기 실패');
                }
            })

        })
    </script>
</head>
<body>
    <div id="output">
<%--        <ul>
            <li>{name}</li>
            <li>{name}</li>
            <li>{name}</li>

        </ul>--%>
    </div>
</body>
</html>
