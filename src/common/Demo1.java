package common;

/**
 * 文 件 名: Demo1
 * 创 建 人: CXP
 * 创建日期: 2019-03-18 10:34
 * 描    述: 100盏灯开关的问题通过计算约数个数实现
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Demo1 {
    public static void main(String[] args) {
        /*保存开灯数量*/
        int result=0;
        /*保存约数个数*/
        int num[]=new int[100];
        /*将数组初始化为0*/
        for(int i=0;i<num.length;i++)
            num[i]=0;

        /*计算约数个数*/
        for(int i=1;i<=100;i++)
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    num[i-1]++;
                }
            }

        /*统计开灯数*/
        for(int i=0;i<num.length;i++){
            if (num[i]%2==1){
                result++;
            }
        }

        /*输出开灯的数目*/
        System.out.println(result);
    }
}
