function loginCheck(){
	if(document.login.mem_id.value==""){
		alert("아이디를 입력해 주세요.");
		document.login.mem_id.focus();
		return; //return false;
	}
	if(document.login.mem_passwd.value==""){
		alert("비밀번호를 입력해 주세요.");
		document.login.mem_passwd.focus();
		return;
	}
	document.login.submit(); // document.폼객체명.submit() -> 수동으로 전송처리
}

function memberReg(){
	//document.location = 'agreement.jsp';
	// 안먹혀서 Login.jsp 에서 다이렉트 연결로 수정함. ( Login.jsp -56 row)
	
}

function inputCheck(){
	if(document.regForm.mem_id.value==""){
		alert("아이디를 입력해 주세요.");
		document.regForm.mem_id.focus();
		return;
	}
	if(document.regForm.mem_passwd.value==""){
		alert("비밀번호를 입력해 주세요.");
		document.regForm.mem_passwd.focus();
		return;
	}
	if(document.regForm.mem_repasswd.value==""){
		alert("비밀번호를 확인해 주세요");
		document.regForm.mem_repasswd.focus();
		return;
	}
	if(document.regForm.mem_name.value==""){
		alert("이름을 입력해 주세요.");
		document.regForm.mem_name.focus();
		return;
	}
	if(document.regForm.mem_email.value==""){
		alert("이메일을 입력해 주세요.");
		document.regForm.mem_email.focus();
		return;
	}
	if(document.regForm.mem_phone.value==""){
		alert("연락처를 입력해 주세요.");
		document.regForm.mem_phone.focus();
		return;
	}
	if(document.regForm.mem_job.value=="0"){
		alert("직업을 선택해 주세요.");
		document.regForm.mem_job.focus();
		return;
	}
	
	if(document.regForm.mem_passwd.value != document.regForm.mem_repasswd.value){
		alert("비밀번호가 일치하지 않습니다.");
		document.regForm.mem_repasswd.focus();
		return;
	}
	document.regForm.submit();
}

//중복ID체크 해주는 자바스크립트함수 선언
function idCheck(id){
	if (id == "") {
		alert("아이디 입력 요망");
		// documnet.폼객체명.입력양식객체명.함수명()

		document.regForm.mem_id.focus(); // 커서 넣어주기.
	}else { // id 값이 전달되는 경우
		url = "IdCheck.jsp?mem_id=" + id;
		// 1. 불러올 문서명  2. 창의 제목 3. 창의옵션(위치, 크기 지정) // GET 방식
		// menubar(메뉴바), status(상태바), scrollbars(스크롤가능)=yes | no
		open(url, "post", "left=400,top=220,width=300,height=150," + "menubar=no, status=yes, toolbar=no, scrollbars=yes");
		//open('idCheck.html', 'w', 'left=350,top=150,width=300,height=150');
	}
}
//우편번호를 검색해주는 함수선언
function zipCheck(){
	// check=y | check=n : 우편번호 검색창의 모습을 구분짓기 위한 인자(매개변수로 구분해서 전달)
	url = "ZipCheck.jsp?check=y";
	// menubar(메뉴바), status(상태바), scrollbars(스크롤가능)=yes | no
	open(url, "post", "left=400,top=220,width=500,height=300," + "menubar=no, status=yes, toolbar=no, scrollbars=yes");
	//open('idCheck.html', 'w', 'left=350,top=150,width=300,height=150');
}
