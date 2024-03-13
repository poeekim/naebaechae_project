
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Include 지시어 특징 (메인페이지)</title>
</head>
<body>
    <h3>이 페이지는 include 지시어를 연습하기 위해 만들어진 페이지</h3>
<%--    <%! // 느낌표 있으면 declation (선언문)
        String str = "Testing practice";
        String getString(){
            return str;
        } %>--%>
    <%@ include file="./sub/JspModule.java"%>
    <h3> 테스트 중입니다. </h3>
    <h3> 테스트 중입니다. </h3>
    <h3> 테스트 중입니다. </h3>
    <%=getString()%>
    <h3> 테스트 중입니다. </h3>
    <h3> 테스트 중입니다. </h3>
    <h3> 테스트 중입니다. </h3>
    <%=getString()%>
    <h3> 테스트 중입니다. </h3>
    <h3> 테스트 중입니다. </h3>
    <h3> 테스트 중입니다. </h3>
    <%=getString()%>
    <h3> 테스트 중입니다. </h3>
    <h3> 테스트 중입니다. </h3>
    <h3> 테스트 중입니다. </h3>
    <%=getString()%>
    <%-- 지시어 종류, 액션태그의 주석은 눈에 보이지 않는 주석을 사용한다. --%>
    <%--<%@ include file="./bottom/bottom.html"%>--%>
    <%-- 반복되는 로직을 별개의 파일로 빼놓고 불러 올 수 있음 (해당 예제는 bottom.html 이므로
        한글이 깨져서나오니 원래 프로젝트에서는 jps 파일로 만들어 호출한다.
        --%>

<%--    <div class="area_user">
        <div class="au_wrap">
            <h3 class="au_tit">Creators</h3>
            <ul class="au_l">
                <li class="au_item"><a href="http://www.navercorp.com/ko/service/creators.nhn" data-clk="crt.creator" class="au_a">크리에이터</a></li>
                <li class="au_item"><span class="au_bar"></span><a href="http://www.navercorp.com/ko/service/business.nhn" data-clk="crt.smbusiness" class="au_a">스몰비즈니스</a></li>
            </ul>
        </div>
        <div class="au_wrap">
            <h3 class="au_tit">Partners</h3>
            <ul class="au_l">
                <li class="au_item"><a href="http://business.naver.com/guide.html" data-clk="ptn.guide" class="au_a">비즈니스 파트너 안내</a></li>
                <li class="au_item"><span class="au_bar"></span><a href="http://business.naver.com/service.html" data-clk="ptn.service" class="au_a">비즈니스 · 광고</a></li>
                <li class="au_item"><span class="au_bar"></span><a href="https://sell.storefarm.naver.com/#/home/about" data-clk="ptn.store"class="au_a">스토어 개설</a></li>
                <li class="au_item"><span class="au_bar"></span><a href="https://smartplace.naver.com/" data-clk="ptn.place"class="au_a">지역업체 등록</a></li>
            </ul>
        </div>
        <div class="au_wrap">
            <h3 class="au_tit">Developers</h3>
            <ul class="au_l">
                <li class="au_item"><a href="http://developers.naver.com" data-clk="dvl.center" class="au_a au_sa">네이버 개발자센터</a></li>
                <li class="au_item"><span class="au_bar"></span><a href="https://developers.naver.com/docs/common/openapiguide/#/apilist.md/" data-clk="dvl.openapi" class="au_a">오픈 API</a></li>
                <li class="au_item"><span class="au_bar"></span><a href="http://naver.github.io/" data-clk="dvl.opensource" class="au_a">오픈소스</a></li>
                <li class="au_item"><span class="au_bar"></span><a href="http://d2.naver.com/" data-clk="dvl.d2" class="au_a">네이버 D2</a></li>
                <li class="au_item"><span class="au_bar"></span><a href="http://www.naverlabs.com/" data-clk="dvl.labs" class="au_a">네이버 랩스</a></li>
            </ul>
        </div>
    </div>
    </div>--%>


</body>
</html>
