
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="java.util.*, hewon.*" %>
<!DOCTYPE html>
<jsp:useBean id="memMgr" class="hewon.MemberDAO"/>
<%
    System.out.println("-------------Connect ZipCheck.jsp------------ ");
    //script.jsp 에서 ZipCheck() 호출 -> ZipCheck.jsp?check=y
    request.setCharacterEncoding("utf-8");

    String check = request.getParameter("check"); // 검색 전 : y  검색 후 : n
    String area3 = request.getParameter("area3"); // 검색어 입력
    System.out.println("Zipcheck.jsp - check = " + check);
    System.out.println("Zipcheck.jsp - area3 = " + area3);
    // MemberDAO memMgr = new MemberDAO(); -> 4 row 액션태그로 객체 생성함
    ArrayList<ZipcodeDTO> zipcodeList = memMgr.zipcodeRead(area3);
    int totalList = zipcodeList.size();
    System.out.println("검색 된 총 레코드 수 : totalList = " + totalList);

%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>우편번호 검색창(ZipCheck.jsp)</title>
    <link href="style.css" rel="stylesheet" type="text/css">
    <script>
        function dongCheck() {
            if (document.zipForm.area3.value == "") {
                alert("동 이름을 입력하시오.");
                document.zipForm.area3.focus();
               return;
            }
            document.zipForm.submit(); //일반버튼 or 링크문자열 일 경우 -> 수동전송 필수
        }
        // 검색 된 레코드 중에서 내 주소를 찾아서 링크 클릭
        // register.jsp(부모창) 의 특정항목에 값을 넣어주는 함수
        // 부모창(opener)  |  자식창(self)
        // 표현식) opener.document.폼객체명.입력양식.속성=값
        function sendAddress(zipcode, area1, area2, area3, area4) {
            let address = area1 + " " + area2 + " " + area3 + " " + area4;
            opener.document.regForm.mem_zipcode.value=zipcode;
            opener.document.regForm.mem_address.value=address;
            self.close();
        }

    </script>
    <style>
        body{
            background:#FFFFCC;
        }
        .container{
            text-align:center;
        }
        .zip{
            font-weight:bolder;
            color:red;
            text-align:center;
        }
        table{
            /* text-align:center; */
            /* border:1px solid black;*/
            width:65%;
            margin-left:120px;
        }
    </style>
</head>41
<body>
<div class="container">
    <div class="zip">우편번호 찾기</div>
    <!--table>form>tr*4>td-->
    <table>
        <form name="zipForm" method="post" action="ZipCheck.jsp"> <%-- 현재 창에서 검색 된 결과를 출력하기 위해서는 action 속성 값을 본인(현재 페이지)의 값을 넣으면 됨--%>
            <tr><!-- 동이름 검색-->
                <td><br>
                    <label>동이름 입력:<input type="text" name="area3" ></label>
                    <input type="button" value="검색" onclick="dongCheck()">
                </td>
            </tr>
            <!--hidden 입력박스(사용자로부터 값을 직접적으로 입력X 반드시 데이터를 전송해야 될경우 사용O)
                name="전달할 변수명" value="전달할값"
            -->
            <input type="hidden" name="check"  value="n">
        </form>
        <!-- 검색된 결과가 바로 출력시키기 위해서 -->
        <%
        // 검색어를 입력하고 검색버튼을 눌렀다면
            if (check.equals("n")) {
                if (zipcodeList.isEmpty()) { // 검색된 레코드 값들이 없다면 %>
             <tr>
                  <td align="center"><br>검색된 레코드가 없습니다.</td>
             </tr>
            <% } else { %>
            <tr>
                <td align="center"><br>
                    *검색후, 아래 우편번호를 클릭하면 자동으로 입력됩니다.
                </td>
            </tr>
            <!-- 검색결과 출력-->
            <%
                for (int i = 0; i < totalList; i++) {
                    ZipcodeDTO zipBean = zipcodeList.get(i);
                    String tempZipcode = zipBean.getZipcode(); // 우편번호
                    String tempArea1 = zipBean.getArea1().trim(); // 시
                    String tempArea2 = zipBean.getArea2().trim(); // 구
                    String tempArea3 = zipBean.getArea3().trim(); // 동
                    String tempArea4 = zipBean.getArea4().trim(); // 나머지
            %>
            <tr>
                <td>
                    <a href="JavaScript:sendAddress('<%=tempZipcode%>','<%=tempArea1%>','<%=tempArea2%>','<%=tempArea3%>','<%=tempArea4%>')">
                        <center>
                            <%=tempZipcode%>&nbsp;<%=tempArea1%>&nbsp;<%=tempArea2%>&nbsp;<%=tempArea3%>&nbsp;<%=tempArea4%><br>
                        </center>
                    </a><br>
                    <%
                                }
                            }
                        }
                    %>
                </td>
            </tr>
            <!-- -->
            <tr><!-- a href="JavaScript:자바스크립트코드 or 함수명(~)"-->
                <td align="center"><a href="JavaScript:self.close()">닫기</a></td>
            </tr>
    </table>
</div>
</body>
</html>
