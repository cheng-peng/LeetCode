package common;

import java.util.Scanner;

/**
 * 文 件 名: Demo2
 * 创 建 人: CXP
 * 创建日期: 2019-03-18 11:10
 * 描    述: 1000瓶水其中有一瓶水有毒，有10只老鼠并且只要老鼠喝了有毒的水必死。请问怎样通过一次实验找出有毒的那瓶水。
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Demo2 {
    public static final int waterNumber = 1000;//水的数目
    public static final int mouseNumber = 10;//老鼠的数目

    public static void main(String args[]){
        int water[] = new int[waterNumber];
        int mouse[] = new int[mouseNumber];
        int i,j;
        String s;
        StringBuffer sb;
        int flag = 1;

        Scanner reader = new Scanner(System.in);
        for( i=0; i<mouseNumber; i++){
            System.out.println("请输入第"+i+"老鼠的存活情况(1 表示死了，0表示还活着)");
            mouse[i] = reader.nextInt();
        }
        for( i=0; i<mouseNumber; i++ ){//mouseNumber只老鼠
            for( j=0; j<waterNumber; j++ ){//1000瓶水
                s = Long.toBinaryString(j);//将 j 转换为二进制
                sb = new StringBuffer(s);
                sb.reverse();//将字符串反转
                if( sb.length() >= i+1 ){//字符串长度
                    if( mouse[i] == 1 ){//老鼠死了
                        if( sb.charAt(i) == '1'){//第i只老鼠喝了第j瓶水
                            water[j]--;
                        }
                    }
                    else{//老鼠未死
                        if( sb.charAt(i) == '1'){
                            water[j]++;
                        }
                    }
                }
            }
        }
        int min = 0;
        for( i=0; i<waterNumber; i++ ){//找出数值最小的water
            if( water[i] < min ){
                min = water[i];
                flag = i;
            }
        }
        if( min < 0 ){
            System.out.println("第瓶"+flag+"瓶水有毒!!!");
        }
        else{
            System.out.println("第瓶0瓶水有毒!!!");
        }
    }
}
