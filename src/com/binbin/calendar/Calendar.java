package com.binbin.calendar;

/**
 * ����
 * @author Administrator
 *
 */
public class Calendar {
     public static void main(String[] args) {
		@SuppressWarnings("unused")
		int sum=0;//����
		//�����1990�굽2016�����������
		for(int year=1900;year<=2015;year++){
			if(year%4==0&&year%100!=0||year%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		
		//�����·�
		for(int month=1;month<=3;month++){
			//�ж�2�·�
			if(month==2){
				//�ж��Ƿ�Ϊ����
				if(2016%4==0&&2016%100!=0||2016%400==0){
					sum+=29;
				}else{
					sum+=28;
				}
			}else{
				//�ж��Ƿ�С��
				if(month==4||month==6||month==9||month==11){
					sum+=30;
				}else{
					sum+=31;
				}
			}
		}
		sum+=1;
		//����
		//System.out.println("1990��1��1�յ�2016��5��7��һ��"+sum+"��");
		//������%7�͵������ڼ�
		//System.out.println("2016��4��7��"+sum%7);
		int wekday=sum%7;//����
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		for(int i=1;i<=wekday;i++){
			System.out.print("\t");
		}
//		System.out.print("2");
		//�����������
		for(int i=1;i<=30;i++){
			if(sum%7==6){
				System.out.print(i+"\n");
			}else{
				System.out.print(i+"\t");
			}
			sum++;
		}
	}
}
