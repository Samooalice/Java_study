package day25;
import java.sql.*;

public class Test02_JDBC {

	public Test02_JDBC() {
		// TODO Auto-generated constructor stub
		try {
			// 1. 드라이버 로딩
			// 해당 행이 이상없이 끝나면 드라이버 로딩은 끝난상태
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			System.out.println("***** 드라이버 로딩 성공 *****");
			
			// 2. 오라클에 접속 시도
				/*
				 * DB회사마다 접속하는 방법이 약간씩 다름(googling합시다)
				 * 방법을 찾으면 이후에 JDBC에게 명령
				 * 	DriverManager.getConnection(url, 계정, 비번);
				 * 		=> 필요한 정보 : 계정이름, 비밀번호, 서버주소, 포트번호, DB아이디
				 * 오라클 연결 형식 : jdbc:oracle:thin:@localhost:1521:xe
				 * 	jdbc:oracle:thin:@서버주소:포트번호:DB아이디
				 */
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "jennie";
			String pw = "12345";
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			System.out.println("***** 접속 성공 *****");
			/*
			 * 접속이 완료되면, 접속자를 관리하는 세션을 얻게 된다.
			 * JDBC에서는 오라클에서 접속을 의미하는 Session을 Connection이라고 부름
			 * 
			 * 접속을 관리하는 클래스가 Connection 클래스
			 * Connection을 추상함수로 만든 이유 -> 세션을 관리하는 방법이 DBMS마다 모두 다르므로
			 * 	접속하는 순간, 함수의 기능을 맞춰서 조절하기 위함
			 */
			
			// 3. Statement를 만든다
			Statement stmt = connection.createStatement();	// 명령 전달 도구
			
			// 4. 질의 명령 준비
			String sql = 
					"SELECT " +
							"empno, ename, job, mgr, hiredate, sal, comm, deptno " +
					"FROM " +
							"emp " +
					"WHERE "+
							"empno = 7369"
					
			;
			
			//5. 잘의 명령을 전달 도구에 실어서 보내면 된다.
			ResultSet rs = stmt.executeQuery(sql);
			// 6. 데이터 꺼내서 저장하고
			// 작업줄 한 줄 내리고
			rs.next();
			
			int no = rs.getInt("empno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			int mrg = rs.getInt("mgr");
			Date hDate = rs.getDate("hiredate");
			Time hTime = rs.getTime("hiredate");
			int sal = rs.getInt("sal");
			int comm = rs.getInt("comm");
			int deptno = rs.getInt("deptno");
			
			System.out.println(no +"|"+ ename +"|"+ job +"|"+ mrg +"|"+ 
									hDate +":"+ hTime +"|"+ sal +"|"+ comm +"|"+ deptno);
			
			rs.close();
			stmt.close();
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test02_JDBC();
	}

}
