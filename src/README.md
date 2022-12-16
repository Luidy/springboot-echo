<div align="center">
<h1>Spring MVC</h1>
</div>

- 모든 클라이언트 요청을 받는 프론트 컨트롤러와 프론트 컨트롤러로부터 위임을 받는 컨트롤러로 구분되는 프론트 컨트롤러 패턴을 기초로 한 아키텍처를 가짐
- 클라이언트의 모든 요청은 Dispatcher Sevlet이 받음
- Dispatcher Servlet이 HandlerMapping(`@RequestMapping`) 기법을 통해 위임이 필요한 컨트롤러를 매핑함
- 매핑된 컨트롤러는 요청을 처리해서 응답을 줌
- 기존에는 페이지가 필요했기 때문에 View Resolver를 통해 응답을 줌(e.g. `*.JSP`)
- Restful Web Service에서는 View Resolver를 사용하지 않음
