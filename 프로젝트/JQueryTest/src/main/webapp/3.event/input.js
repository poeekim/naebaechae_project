
/*    Created by IntelliJ IDEA.
    User: 김현아
Date: 2024-04-04
Time: AM 10:14
목적 : 회원가입 처리용 jQuery
To change this template use File | Settings | File Templates.*/

$(function () {
    // 에러메시지는 처음에는 안보이게 설정 show() <-> hide()
    $('#id_error').hide();
    $('#age_error1').hide();
    $('#age_error2').hide();
    $('#p_error1').hide();
    $('#p_error2').hide();

    // <input type="button" id="btnSend" value="전송">
    $('#btnSend').click(function (){

        // 1. id 입력체크
        let id = $('#userid').val();
        if (id.length == 0) {
            $('#id_error').show();
            return false;
        }else {//입력했다면
            $('#id_error').hide();
        }

        // 2. age 입력체크
        let age = $('#age').val();
        if (age.length == 0) {
            $('#age_error1').show();
            return false;
        }else {//입력했다면
            $('#age_error1').hide();
        }


        // 3. 숫자인지 체크 ( isNaN() 함수 이용하거나, 로직을 사용함 -> 문자일 경우 true)
        // 0(48) ~ 9(57) 범위를 벗어나면 String 으로 간주.
        // charAt(인덱스번호)로 하나씩 뺴와서 숫자인지, 문자인지 확인

        for (let i = 0; i < age.length; i++) {
            let data = age.charAt(i).charCodeAt(0); // 아스키코드로 변환
            if (data<48 || data>57){
                $('#age_error2').show();
                return false;
                break;
            }else {
                $('#age_error2').hide();
            }
        }


        // 4. pw 체크
        let pwd1 = $('#pwd1').val();
        if (pwd1.length == 0) {
            $('#p_error1').show();
            return false;
        }else {
            $('#p_error1').hide();
        }

        // 5. pw 불일치 체크
        let pwd2 = $('#pwd2').val();
        if (pwd2.length == 0) {
            $('#p_error2').show();
            return false;
        }else {
            $('#p_error2').hide();
        }
        // 비번 다시입력한 부분과 일치여부
        if (pwd1 != pwd2) {
            $('#p_error2').show();
        }else{//입력했다면
            $('#p_error2').hide();
        }

            // 다 입력을 했다면, documnet.form객체명.submit() 을 썼겠지만
        $('#signup').attr('action','register.jsp').submit();
        return  true;
    })

})
