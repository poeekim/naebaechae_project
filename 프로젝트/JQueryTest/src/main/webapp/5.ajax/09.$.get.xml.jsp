
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>10.$.get.xml.jsp</title>
    <%--
    외부에서
    [  {
   "id":"1",
   "name":"레몬",
   "price":"3000",
   "description":"피로회복에 좋고 비타민C 풍부"
  },
  {"id":"2",
   "name":"키위",
   "price":"2000",
   "description":"비타민C 풍부,다이어트와 미용"},
   ,,,,,
    ]
    ---> 확장 for 문을 사용하여 값을 꺼내온다
            for(변수명:배열명 또는 객체명) : 자바 구문
            for(let i(인덱스) in 배열명 또는 객체명) : 자바스크립트 구문
    --%>

    <script>

        $(function () {
/*            $.ajax({
                url: 'item2.json', /!* 요청 문서 url : 요청문서(basic/item2.json) *!/
                dataType: 'json',
                success:function (data){*/
                    $.get('item.xml',function (data){

                    $('#treeData').append('<tr><td>id</td>'+'<td>name</td>'+'<td>price</td>'+'<td>description</td></tr>');
                    /*
                    * 불러올 데이터가 태그 덩어리 -> $(반복할 선택자).each(~)
                    *                           $(this)로 불러오는 태그를 구분해서 파싱(find() or filer())
                    *
                    * 불러올 데이터가 태그가 아닐 경우 -> $.each(컬렉션객체(ex.배열), 호출해서 처리할 함수명 또는 익명함수 function)
                    *   -> this(현재 읽어들이는 익명객체({}로 표시) 를 가리킨다.)
                    *       this.키명 ==> 값을 가져온다.
                    * */

                    $(data).find('item').each (function(){
                        $('#treeData').append('<tr><td>' + $(this).attr('id') + '</td><td>' +
                            $(this).attr('name') + '</td><td>' + $(this).attr('price') + '</td><td>' + $(this).attr('description') + '</td></tr>')

                    })
                })
            })
    </script>
</head>
<body>
<table id="treeData" border="1px solid black">

</table>
</body>
</html>
