
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="hewon.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MemberUpdate.jsp(회원수정)</title>
    <link href="style.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="script.js?ver=1"></script>
    <style>
        .title{
            font-size:15pt;
            font-weight:bolder;
            text-align:center;
            color:blue;
        }
        .td1{
            background-color:#FFFFCC;
        }
        .td2{
            width:16%;
        }
        .td3{
            width:57%;
        }
        .td4{
            width:27%;
        }
        .td5{
            text-align:center; /*버튼의 value도 글자이기에 가운데 정렬*/
        }
        /*추가 */
        body{
            background-color:#996600;/* inline(style)>embedd>script.css>디폴트 브라우저 설정  */
        }
    </style>
</head>
<body>
<%
    String mem_id = (String) session.getAttribute("idKey"); // 로그인|비로그인 화면이 달라야하므로.
    System.out.println("MemberUpdate.jsp 의 mem_id = " + mem_id);

    MemberDAO memMgr = new MemberDAO();
    MemberDTO mem = memMgr.getMember(mem_id);

%>
<!--table>tr>td-->
<br><br>
<table  align="center" border="0" cellspacing="0" cellpadding="5"><!-- outer table-->
    <tr>
        <td class="td1">
            <!--inner table  table>tr*11>td*3-->
            <table border="1" cellspacing="0" cellpadding="2" align="center">
                <form action="MemberUpdateProc.jsp" method="post" name="regForm">
                    <tr>
                        <td colspan="3" class="title">회원수정</td>

                    </tr>
                    <tr><!-- 100%  td width="16%"-->
                        <%-- id 매개변수가 전달이 돼서 에러가 발생
                        input 박스 내 작성된 value 값이 jsp로 전달되고, 전달된 값을 request.getParameter("속성값")
                        으로 사용할 수 있는 것임.
                        ---> input box 를 작성하는 경우 : input box 를 readonly 설정하여, 읽기전용으로 바꾼다.
                        ---> input box 를 작성하지 않는 경우 : 입력하지 않고 수동적(hidden 객체를 사용한다.)으로 mem_id 매개변수를 전달한다.
                        hidden 객체는 form 태그 내에서만 사용이 가능하다.!!!!!!!
                        --%>
                        <td class="td2">아이디</td>
                        <td class="td3" >
                            <%=mem.getMem_id()%>
                        </td>
                        <td class="td4">아이디를 적어주세요</td>
                    </tr>
                    <input type="hidden" name="mem_id" value="<%=mem.getMem_id()%>">
                    <tr>
                        <td>패스워드</td>
                        <td>
                            <input type="password" name="mem_passwd" size="15" value="<%=mem.getMem_passwd()%>">
                        </td>
                        <td>패스워드를 적어주세요</td>
                    </tr>
<%--                    <tr>
                        <td>패스워드확인</td>
                        <td><input type="password" name="mem_repasswd" size="15"></td>
                        <td>패스워드를 확인합니다.</td>
                    </tr>--%>
                    <tr><!-- 이름-->
                        <td>이름</td>
                        <td><input type="text" name="mem_name" size="15" value="<%=mem.getMem_name()%>"></td>
                        <td>고객실명을 적어주세요</td>
                    </tr>
                    <tr><!--이메일-->
                        <td>이메일</td><!--input:email-->
                        <td><input type="text" name="mem_email" size="27" value="<%=mem.getMem_email()%>"></td>
                        <td>이메일을 적어주세요</td>
                    </tr>
                    <tr><!--전화번호-->
                        <td>전화번호</td>
                        <td><input type="text" name="mem_phone" size="20" value="<%=mem.getMem_phone()%>"></td>
                        <td>연락처를 적어주세요</td>
                    </tr>
                    <tr><!--우편번호 버튼-->
                        <td>우편번호</td>
                        <td><input type="text" name="mem_zipcode" size="7" value="<%=mem.getMem_zipcode()%>">>
                            <input type="button" value="우편번호찾기"
                                   <%-- open('ZipCheck.html','w','left=400,top=220,width=550,height=300')--%>
                                   onclick="zipCheck()"><!-- 이벤트처리-->
                        </td>
                        <td>우편번호를 검색 하세요</td>
                    </tr>
                    <tr><!--주소-->
                        <td>주소</td>
                        <td><input type="text" name="mem_address" size="70" value="<%=mem.getMem_address()%>"></td>
                        <td>주소를 적어 주세요.</td>
                    </tr>
                    <tr><!--직업-->
                        <td>직업</td>
                        <td><!-- 콤보박스에 없는 값을 필드에 저장하면 연결안된 것 처럼 나옴.-->
                            <select name="mem_job"><!-- option*12-->
                                <option value="0">선택하세요</option>
                                <option value="회사원">회사원</option>
                                <option value="연구전문직">연구전문직</option>
                                <option value="교수학생">교수학생</option>
                                <option value="일반자영업">일반자영업</option>
                                <option value="공무원">공무원</option>
                                <option value="의료인">의료인</option>
                                <option value="법조인">법조인</option>
                                <option value="종교.언론/예술인">종교.언론/예술인</option>
                                <option value="농/축/수산/광업인">농/축/수산/광업인</option>
                                <option value="주부">주부</option>
                                <option value="기타">기타</option>
                            </select>
                            <script>
                                document.regForm.mem_job.value="<%=mem.getMem_job()%>"
                            </script>
                        </td>
                        <td>직업을 선택하세요.</td>
                    </tr>
                    <tr><!--전송버튼-->
                        <td class="td5" colspan="3">
                            <input type="submit" value="수정완료" >
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="reset" value="다시쓰기" >
                            <input type="button" value="수정취소" onclick="history.back()">
                        </td>
                        <!--<td></td>
                        <td></td> -->
                    </tr>
                </form>
                <!-- -->
            </table>
        </td>
    </tr>
</table>
</body>
</html>