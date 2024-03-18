
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>2.register.html(회원가입창)</title>
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
<!--table>tr>td-->
<br><br>
<table  align="center" border="0" cellspacing="0" cellpadding="5"><!-- outer table-->
    <tr>
        <td class="td1">
            <!--inner table  table>tr*11>td*3-->
            <table border="1" cellspacing="0" cellpadding="2" align="center">
                <form action="RegisterProc.jsp" method="post" name="regForm">
                    <tr>
                        <td colspan="3" class="title">회원가입</td>
                        <!--<td></td>
                        <td></td>-->
                    </tr>
                    <tr><!-- 100%  td width="16%"-->
                        <td class="td2">아이디</td>
                        <td class="td3"><input type="text" name="mem_id" size="15">
                            <!--open(1.문서이름,2.창이름 3.left=?,top=150,width=?,height=?(창의 옵션)) -->
                            <input type="button" value="ID중복확인"
                                   onclick="idCheck(this.form.mem_id.value)"><!-- 이벤트처리-->
                        </td>
                        <td class="td4">아이디를 적어주세요</td>
                    </tr>
                    <tr>
                        <td>패스워드</td>
                        <td><input type="password" name="mem_passwd" size="15"></td>
                        <td>패스워드를 적어주세요</td>
                    </tr>
                    <tr>
                        <td>패스워드확인</td>
                        <td><input type="password" name="mem_repasswd" size="15"></td>
                        <td>패스워드를 확인합니다.</td>
                    </tr>
                    <tr><!-- 이름-->
                        <td>이름</td>
                        <td><input type="text" name="mem_name" size="15"></td>
                        <td>고객실명을 적어주세요</td>
                    </tr>
                    <tr><!--이메일-->
                        <td>이메일</td><!--input:email-->
                        <td><input type="text" name="mem_email" size="27"></td>
                        <td>이메일을 적어주세요</td>
                    </tr>
                    <tr><!--전화번호-->
                        <td>전화번호</td>
                        <td><input type="text" name="mem_phone" size="20"></td>
                        <td>연락처를 적어주세요</td>
                    </tr>
                    <tr><!--우편번호 버튼-->
                        <td>우편번호</td>
                        <td><input type="text" name="mem_zipcode" size="7">
                            <input type="button" value="우편번호찾기"
                                   <%-- open('ZipCheck.html','w','left=400,top=220,width=550,height=300')--%>
                                   onclick="zipCheck()"><!-- 이벤트처리-->
                        </td>
                        <td>우편번호를 검색 하세요</td>
                    </tr>
                    <tr><!--주소-->
                        <td>주소</td>
                        <td><input type="text" name="mem_address" size="70"></td>
                        <td>주소를 적어 주세요.</td>
                    </tr>
                    <tr><!--직업-->
                        <td>직업</td>
                        <td><!-- ex) mem_job="연구전문직"-->
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
                        </td>
                        <td>직업을 선택하세요.</td>
                    </tr>
                    <tr><!--전송버튼-->
                        <td class="td5" colspan="3">
                            <input type="button" value="회원가입" onclick="">
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="reset" value="다시쓰기">
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