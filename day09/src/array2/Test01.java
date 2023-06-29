package array2;

public class Test01 {
	public static void main(String[] args) {
		//정렬 (sort)
		//- 여러 개의 데이터를 원하는 목적에 맞게 나열하는 것
		//- 번호순, 이름순, 가격순, 랭킹순, 성적순 // 이런류의 단어가나오면 무조건 정렬이다
		//- 번호순이라고 하면 번호가 낮은 것부터 나와야 한다 (오름차순)
		//- 성적순이라고 하면 성적이 높은 것부터 나와야 한다 (내림차순)
		//- 정렬 방법은 여러가지가 잇으며 상황에 따라 성능이 다르다
		//- 사용자에게 데이터를 효과적으로 보여주기 위한 수단이므로 반드시 필요
		//자주 사용하는 정렬 방식들에 대한 비교 시각화 사이트 : toptal (자료사이트에 있음) 
		//정렬의 진행 상황을 단계별로 시각화하는 사이트 : VisuAlgo (자료사이트에 있음) 
		//- selection, bubble, insertion : 정렬 방법, 느린 순서, 이 3개 이외에는 지금 기술로 할 수 없다
		
		int[] data = new int[] {30, 50, 20, 10 ,40};
		
		//선택 정렬 - *회차 (+0부터 +4지점에서 최소값을 찾아 +지점과 교체)
		for (int k = 0 ; k < data.length-1 ; k++) {
			int min = k; //(*-1)번 위치의 값이 가장 작다고 생각
			for (int i = k+1 ; i < data.length ; i++) { //뒤에 있는 데이터와 비교하여
				if (data[min] > data[i]) {              //더 작은 값이 있다면
					min = i;									//교체!
				}
			}
			int temp = data[min];
			data[min] = data[k];
			data[k] = temp;
		}
		for(int i = 0 ; i < data.length ; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
}