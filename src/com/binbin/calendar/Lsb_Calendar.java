package com.binbin.calendar;

/**
 * ����
 * ���1990��1��1�յ����ڵ�����
 * @author Administrator
 *
 */
public class Lsb_Calendar {
	
	
    public void calendar(int year,int month){
        
    	int sum=0;//��������������
    	int day=0;//����
    	int weekDay=0;//����
    	
    	//ͨ��ѭ�������������
    	for(int i=1990;i<year;i++){
    		if(year%4==0&&year%100!=0||year%400==0){
    			sum+=366;
    		}else{
    			sum+=365;
    		}
    	}//System.out.println("�����������"+sum);
    	
    	//�����һ���µ��������ӵ�������ȥ
    	//��������
        if(month>=0&&month<=12){
        	for(int i=1;i<month;i++){
        		if(i==2){
        			//������ͼ���29
        			if(year%4==0&& year%100!=0||year%400==0){
        				sum+=29;
        			}else{
        				sum+=28;
        			}
        		}else{
        			//�ж��Ƿ��С�� 30/31
        			if(i==4||i==6||i==9||i==11){
        				sum+=30;
        			}else{
        				sum+=31;
        			}
        		}
        	}
    	}else{
    		System.out.println("��������");
    	}
        sum+=1;//����
        
        //�ж��·ݵ�30��31��
        if(month==2){
        	if(year%4==0&&year%100!=0||year%400==0){
        		day=29;
        	}else{
        		day=28;
        	}
        }else{
        	if(month==4||month==6||month==9||month==11){
        		day=30;
        	}else{
        		day=31;
        	}
        }
        
        
        
        weekDay=sum%7;//�����һ�ܵ����ڼ�
       
        System.out.println("��\tһ\t��\t��\t��\t��\t��");
        for(int i=1;i<=weekDay;i++){
        	System.out.print("\t");
        }
        
        //�������
        for(int i=1;i<=day;i++){
        	if(sum%7==6){
        		System.out.print(i+"\n");
        	}else{
        		System.out.print(i+"\t");
        	}
        	sum++;
        }
        
    	
    }
}
