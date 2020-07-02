package com.biz.service;
/*
 *  ScoreService 클래스를 디자인하기
 *  	boolean intputScore()
 *  	void calcSum()
 * 		void clacAvg()
 *  	void scoreList()
 *  
 *  인터페이스
 *  	자바 클래스의 한 형태이다
 *  	메서드들의 원형(Prototype)을 정의만 할 수 있다.
 *  	메서드들이 할일 (코드)는 구체적으로 작성 할 수 없다.
 *  	모든 메서드는 {}가 없이 메서드에서 바로 문장이 종료된다.
 *  	인터페이스를 implements할 클래스에 규칙을 지정한다.
 *  	인터페이스를 implements한 클래스는 인터페이스에 정의된 메서드를 모두 구현해야 한다.
 *  	인터페이스에 정의 된 모든 메서드를 의무적으로 포함해야 한다.
 *  	인터페이스에 정의 된 메서드 이름을 변경하여 사용할 수 없다.
 *  	자신이 어떤 메서드를 구체적으로 만들어야 하는지 명확히 알 수 있다.
 *  	인터페이스를 implements한 클래스를 사용하는 곳에서는 
 *  		지금 호출하는 method는 어떤 클래스를 사용하든 같은 이름일 것이다.라는 기대
 *  		지금 호출하는 method가 반드시 존재하는 메서드 이다.라는 기대 
 *  		혹시 다른 클래스를 사용해서 객체(인스턴스)를 생성했을 때 
 *  		나머지 부분의 코드를 (거의) 변경 없이 테스트, 사용이 가능하다는 기대
 *  
 *  	인터페이스를 사용하므로 해서 (Service) 클래스와 (Main)클래스간에
 *  	결합도는 낮아지고 응집도는 높아져서 개발 생산성, 유지보수성, 등이 매우 좋아진다.
 *  
 *  	인터페이스를 잘 디자인 해 두면, 어플리케이션을 만들어가는 과정 중에
 *  	후반부로 갈수록 시간, 비용등이 절약된다.
 *  
 */
public interface ScoreService {
	// 메서드 이름은 정의 내릴 수 있으나 해야 할 일은 정의 내리지 않음.
	public boolean inputScore(); // method() { ... }
	public void calcSum();
	public void calcAvg();
	public void scoreList();

	
	

}
