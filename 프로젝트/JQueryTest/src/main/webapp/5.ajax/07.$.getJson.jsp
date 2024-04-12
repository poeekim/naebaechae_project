<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>07.$.getJson.jsp</title>

    <!--
             "title": "Recent Uploads tagged raccoon",
            "link": "http:\/\/www.flickr.com\/photos\/tags\/raccoon\/",
            "description": "",
            "modified": "2019-03-17T19:43:03Z",
            "generator": "http:\/\/www.flickr.com",
            "items": [
           {
                "title": "Lost \u2601\ufe0f",
                "link": "http:\/\/www.flickr.com\/photos\/pure_embers\/32463827727\/",
                "media": {"m":"http:\/\/farm8.staticflickr.com\/7847\/32463827727_92fe9aa458_m.jpg"},
                "date_taken": "2019-03-15T02:42:29-08:00",
                "description": " <p><a href=\"http:\/\/www.flickr.com\/people\/pure_embers\/\">pure_embers<\/a> posted a photo:<\/p> <p><a href=\"http:\/\/www.flickr.com\/photos\/pure_embers\/32463827727\/\" title=\"Lost \u2601\ufe0f\"><img src=\"http:\/\/farm8.staticflickr.com\/7847\/32463827727_92fe9aa458_m.jpg\" width=\"240\" height=\"235\" alt=\"Lost \u2601\ufe0f\" \/><\/a><\/p> <p>Vincent and Rackety got a little bit lost in the fog... they stopped to look around and work out the best way home but it was all whiteness &lt;3 <br \/> <br \/> ~<br \/> Circus bear by LindseyThomasMakes, raccoon by ZozoZolala<\/p>",
                "published": "2019-03-17T19:43:03Z",
                "author": "nobody@flickr.com (\"pure_embers\")",
                "author_id": "63432462@N03",
                "tags": "pure embers laura uk pureembers photography kitty teddy circus bear tricycle woods art lindsey thomas makes raccoon zozo zolala needlefelted fog lost"
           },
          ,,,
    -->
    <script>
        $(function () {
            $.getJSON("http://api.flickr.com/services/feeds/photos_public.gne?tags=raccoon&tagmode=any&format=json&jsoncallback=?",function (data) {
                console.log('data.modified' + data.modified);
                console.log("data.title" + data.title);
                // data.items -> 전체를 불러옴.
                // {} 익명객체를 구분하는 인덱스 번호, 처리해주는 함수
                $.each(data.items, function (i,item){
                    // 객체 안에 객체를 ..
                    // <img src="경로포함된 이미지 소스 path(사이트주소)"
                    // img 태그가 있을시에는 $('img')를 사용하지만 , 만약 img 태그가 없을 시에는
                    $('<img>').attr("src", item.media.m).appendTo('#images');
                    // == item.media.m 의 값인 18row string을 아이디가 images 인 태그 뒤에 새로 생성한 img 태그의 src 속성 값에 넣어라.
/*
                    if (i == 4) {
                        return false; // 전체 사진이 5개 이므로, 다 불러오면 더이상 불러오지 말라는 뜻 = break; 의 역할을 해주고 있다.
                    }*/

                    if (i % 2 == 1) {
                        return false; // 만약 너무 많은 사진이 잇을 경우, 최대 2개까지만 보여지도록 할 수 있음.
                    }
                })
            })

        })
    </script>
</head>
<body>
    <div id="images">
        <img src="" alt="">
    </div>
</body>
</html>
