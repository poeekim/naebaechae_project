
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>04.TabMenu.jsp</title>
    <style>
        * {
            margin: 0; /* 바깥 여백 */
            padding: 0; /* 안쪽 여백*/
        }
        #container {
            width: 500px; /* 임의의 숫자, 탭수, 탭 넓이 계산을 위함*/
            margin: 50px auto; /* 상,하로 50px 여백을 주고, 좌우 여백은 자동으로*/
        }
        ul.tab li { /* 탭 제목에 대한 스타일 적용 */
            list-style-type: none;
            width: 100px;
            height: 40px;
            float: left;
        }
        ul.tab li a {
            background: url("../img/tab.jpg");
            display: block;
            color: blue;
            line-height: 40px;
            text-align: center;
        }
        ul.tab li a.selected { /* 선택기본값을 JavaScript 선택되어지게*/
            background: url("../img/tab_selected.jpg");
            text-decoration: none; /* underline, overline, line-through*/
            color: #333;
            cursor: default; /* 손가락이 아닌 default 화살표*/

        }
        ul.panel {  /* 선택된 탭에 대한 내용을 스타일 적용 */
            clear:both; /*위의 배치방법을 초기화 */
            border:1px solid #9FB7D4;
            border-top:none;
            padding:0;
        }
        ul.panel li{
            list-style-type: none;
            paddingp: 10px; /* 테두리 안의 엽개*/
            text-indent: 1em; /* 맨 처음 row 의 들여쓰지 설정 */
            color: #333;
        }

    </style>
    <script>
        $(function () {
            // 첫번쨰 테이블 제외하고 , 나머지탭의 내용은 보이지 않게 설정해야한다.
            // $('ul.panel li:not(' + $('ul.tab li a.selected').attr('href')')'); -> #tab1 을 제외한 나머지
            $('ul.panel li:not(' + $('ul.tab li a.selected').attr('href')+')').hide();

            $('ul.tab li a').click(function (){
                $('ul.tab li a').removeClass('selected'); /* 클릭하기 전 일단 아무것도 선택되지 않도록 초기화.*/
                $(this).addClass('selected'); // 이미지 변경
                $('ul.panel li').hide(); // 모든 li 를 안보이게 설정(나중에 클릭한 메뉴에 대한 내용만 보여주면 됨)
                $($(this).attr('href')).show(); // == $('#tab2')  -> 아이디가 tab2 인 태그가 보여지도록 하자.

            })
        })
    </script>
</head>
<body>
    <div id="container">
        <ul class="tab"> <%-- 탭 제목만 따로 설정, 링크걸 때 #키워드--%>
            <li><a href="#tab1" class="selected">JavaScript</a></li>
            <li><a href="#tab2">css</a></li>
            <li><a href="#tab3">html</a></li>
            <li><a href="#tab4">jQuery</a></li>
            <li><a href="#tab5">Xhtml</a></li>
        </ul>
        <ul class="panel">
            <li id="tab1"> <%-- javascript 내용--%>
                자바스크립트는 다양한 장점과 단점을 가진다. 먼저 장점부터 살펴보자. 자바스크립트는 컴파일 과정이 없기 때문에 다른
                언어와 비교했을 때 빠른 시간 안에 스크립트 코드를 작성할 수 있게 도와준다. 기존 C나 자바 언어와 달리 굉장히 단순한 구조와 원칙을 가지고 있기
                때문에 초보 개발자들이 쉽게 배우고 이해할 수 있다.

                예를 들어 자바스크립트 코드 안에서는 변수, 클래스 및 메소드를 선언하지 않아도 되고, 메소드가 'public', 'private' 또는
                'protected'인지 구분하지 않아도 된다. 이러한 특징은 개발자마다 서로 다른 방식으로 코드를 짜는 부작용도 있다.
                그래서 구글이나 에어비앤비 같은 기업들은 ‘자바스크립트 스타일 가이드’라는 문서를 따로 만들어 읽기 쉽고 실수를 피할 수 있는
                자바스크립트 작성법을 공개하기도 했다. 자바스크립트는 웹에 특화된 기술이기 때문에 운영체제나 플랫폼에 상관없이 잘 작동되고 확장성도 높다.
                단점은 성능이나 보안 측면이다. 일단 내부에서 제공되는 기능이 제한적이고, 관련된 개발도구도 적은 편이다.
                또한 자바스크립트는 HTML 소스코드에 함께 작성되면서 소스코드가 외부로 공개되는데, 이 과정에서 보안 취약점이 발생할 수 있다.
            </li>
            <li id="tab2"> <%-- css 내용--%>
                기존의 HTML은 웹 문서를 다양하게 설계하고 수시로 변경하는데 많은 제약이 따르는데, 이를 보완하기 위해 만들어진 것이 스타일 시트이고
                스타일 시트의 표준안이 바로 CSS이다. 간단히 스타일 시트라고도 한다.

                HTML을 이용해서 웹 페이지를 제작할 경우 전반적인 틀에서 세세한 글꼴 하나 하나를 일일이 지정해주어야 하지만, 웹 페이지의 스타일(작성형식)
                을 미리 저장해 두면 웹 페이지의 한 가지 요소만 변경해도 관련되는 전체 페이지의 내용이 한꺼번에 변경되므로, 문서 전체의 일관성을 유지할 수 있고
                작업 시간도 단축된다.

                따라서 웹 개발자들은 보다 풍부한 디자인으로 웹을 설계할 수 있고, 글자의 크기, 글자체, 줄간격, 배경 색상, 배열위치 등을 자유롭게 선택하거나
                변경할 수 있으며 유지·보수도 간편하게 할 수 있다.
            </li>
            <li id="tab3"> <%-- html 내용--%>
                인터넷 서비스의 하나인 월드 와이드 웹을 통해 볼 수 있는 문서를 만들 때 사용하는 프로그래밍 언어의 한 종류이다. 특히 하이퍼텍스트를 작성하기
                위해 개발되었으며, 인터넷에서 웹을 통해 접근되는 대부분의 웹 페이지들은 HTML로 작성된다.

                HTML은 문서의 글자크기, 글자색, 글자모양, 그래픽, 문서이동(하이퍼링크) 등을 정의하는 명령어로서 홈페이지를 작성하는 데 쓰인다.
                HTML에서 사용하는 명령어는 태그(tag)라고 하는데 꺽쇠괄호"<>"를 사용하여 나타낸다. 일반적으로 태그는 시작과 끝을 표시하는 2개의 쌍으로
                이루어져 있으나 "img", "br"등의 태그와 같이 시작태그만으로 그 영향을 나타내는 경우도 있으며, 종료 태그의 이름은 슬래시 문자[/]로 시작된다.
                이와같이 HTML로 작성된 문서를 HTML문서라 하며 이 HTML로 작성된 문서를 웹 브라우저가 해석하여 이용자에게 보여주게 된다. HTML에서는
                문서가 별도의 코드(code)를 인식하여 완벽한 하이퍼텍스트를 만들 뿐만 아니라 단어 또는 단문을 인터넷의 다른 장소나 파일로 연결시킬 수 있다.

                HTML은 전자 문서의 서식을 정의하기 위해 만들어졌으며, 국제표준 SGML의 부분 집합으로 정의되었다. HTML은 SGML에서 특히 하이퍼텍스트를
                강조하여 만들어진 언어이며, 아스키코드로 된 일반적인 텍스트로 구성되었다. 이 언어는 별도 컴파일러가 필요치 않으며, 웹 브라우저에서 해석이
                가능한 사용하기 쉬운 언어로 각광을 받고 있다.
            </li>
            <li id="tab4"> <%-- jQuery 내용--%>
                jQuery(제이쿼리)는 HTML의 클라이언트 사이드 조작을 단순화 하도록 설계된 크로스 플랫폼의 자바스크립트 라이브러리다. 존 레식이 2006년 뉴욕
                시 바캠프(Barcamp NYC)에서 공식적으로 소개하였다. jQuery는 오늘날 가장 인기있는 자바스크립트 라이브러리 중 하나이다.

                jQuery는 MIT 라이선스와 GNU 일반 공중 사용 허가서v2의 듀얼 라이선스를 가진 자유 오픈 소프트웨어이다. jQuery의 문법은 코드 보기, 문서 객체
                모델 찾기, 애니메이션 만들기, 이벤트 제어, Ajax 개발을 쉽게 할 수 있도록 디자인되었다. 또한, jQuery는 개발자가 플러그인을 개발할 수 있는 기능을
                제공한다.

                마이크로소프트와 노키아는 자사 플랫폼에 jQuery를 포함하는 계획을 발표한 바 있다. 마이크로소프트는 비주얼스튜디오의 ASP.NET AJAX
                프레임워크와 ASP.NET MVC 프레임워크에 적용했고, 노키아는 자사의 런타임 웹 위젯 개발 플랫폼에 통합하였다. 또한, jQuery는 미디어위키에도
                1.16 버전부터 사용되고 있다.
            </li>
            <li id="tab5"> <%-- Xhtml 내용--%>
                XHTML은 HTML의 후속으로 많은 사람들이 XHTML을 HTML의 "최신 버전"으로 보고 있다. 하지만 HTML과 XHTML은 별개의 분리된 표준이다.
                W3C는 지속적으로 웹 출판에서 XHTML 1.1, XHTML 1.0, HTML 4.01 등을 이용하길 권장하고 있다. 그리고 HTML 4.01의 후속 버전으로
                HTML 5가 개발 되었다. 좀 더 엄격한 버전의 HTML의 필요를 느끼게 된 가장 큰 이유는 웹 콘텐츠가 기존의 전통 컴퓨터에서 벗어나 여러 가지 이동
                기기(모바일 컴퓨팅 등)에서 이용되기 시작하면서, 부정확한 HTML을 지원하는 데 필요한 자원이 부족한 환경이 생겨났기 때문이다.
                문서가 검사될 수 있도록 문서형 정의(DTD)를 사용해 XHTML 문서를 규정한다.

                최신의 웹 브라우저들은 XHTML을 정확하게 표현해 주며, XHTML이 거의 HTML에 포함되기 때문에 구형의 브라우저에서도 별 문제가 없다.
                마찬가지로 XHTML을 지원하는 거의 모든 브라우저들은 HTML 역시 정확하게 표현한다. 혹자는 바로 이점이 HTML에서 XHTML으로의 전환을
                더디게 하는 이유라고 말한다.
            </li>
        </ul>
    </div>
</body>
</html>
