# JSP
<h2>깃허브 주소</h2>
간효동 : https://github.com/1243137284<br>
강석현 : https://github.com/Coward-Montblanc<br>
김동욱(11) : https://github.com/crystal6520<br>
김동욱(10) : https://github.com/KDU327<br>
김동현 : https://github.com/Crowasang<br>
김명규 : https://github.com/kuma2156<br>
김명준 https://github.com/JaviJinble<br>
김민오 : https://github.com/screwb4rs<br>
김성진 : https://github.com/XeongZin<br>
김승준 : https://github.com/ksj12341<br>
김영현 : https://github.com/YoungHyeon1<br>
김지선 : https://github.com/jiseonO-O<br>
김지현 : https://github.com/KimJRan<br>
김현우 : https://github.com/Hyunu00<br>
남태양 : https://github.com/SouthSun425<br>
박미르 : https://github.com/NIGHTPURI<br>
박성재 : https://github.com/ParkSJ517<br>
박정수 : https://github.com/rapier456<br>
박현빈 : https://github.com/ppareu<br>
엄민서 : https://github.com/LatteMacchiato1223<br>
오화실 : https://github.com/Hwasil/JSP.git<br>
이도경 : https://github.com/LeeDG3891<br>
이명진 : https://github.com/bbonbbon<br>
정수현 : https://github.com/imsugiii<br>
정연주 : https://github.com/Yeonjuya<br>
조지박 : https://github.com/a1054286727<br>
조현철 : https://github.com/Hyunchel47<br>
조희 : https://github.com/zx4717/zx<br>
차유정 : https://github.com/youjeongcha<br>
최설아 : https://github.com/sseol6023<br>
홍태희 : https://github.com/Undery33<br>
<br>
<hr>

<h2>3월 9일 서블릿 서블릿(Servlet) 생명주기</h2>
<ul>
<li>서블릿 클래스 로딩: 서블릿 컨테이너는 클라이언트 요청이 처음 들어오면, 해당 서블릿 클래스를 메모리에 로딩합니다.</li>
<li>서블릿 인스턴스 생성: 로딩된 서블릿 클래스로부터 서블릿 인스턴스를 생성합니다.</li>
<li>초기화: 서블릿 인스턴스가 생성된 후에는 init() 메서드를 호출하여 초기화 작업을 수행합니다. 이 메서드는 서블릿 인스턴스가 처음 생성될 때 한 번만 호출됩니다.</li>
<li>서비스: 클라이언트 요청이 들어오면, 서블릿 컨테이너는 service() 메서드를 호출합니다. 이 메서드는 요청 방식에 따라 doGet(), doPost() 등으로 분기하여 요청을 처리합니다.</li>
<li>소멸: 서블릿 컨테이너는 서블릿 인스턴스가 더 이상 필요하지 않게 되면 destroy() 메서드를 호출하여 인스턴스를 소멸시킵니다. 이 메서드는 서블릿 인스턴스가 소멸되기 전에 한 번 호출됩니다.</li>
<li>언로딩: 서블릿 클래스가 더 이상 필요하지 않게 되면, 메모리에서 언로딩됩니다.</li>
</ul>
