package demo_10;
/*
    throw关键字
    作用：
        可以使用throw关键字在指定的方法中抛出指定的异常
    使用格式：
        thrown new xxxException(产生异常的原因)

    注意：
        1.throw关键字必须写在方法的内部
        2.throw关键字后边new的对象必须是Exception或者Exception的子类对象
        3.throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
            运行期异常无需自己处理，JVM会自己处理

 */
public class THrow {


    public static void main(String[] args) {
        int[] arr ={1,2,3};
        System.out.println(element(arr,0));
        System.out.println(element(arr,3));//数组越界




    }


    /*
        定义一个方法，获取数组指定索引的元素
         */
    public static int element(int []arr,int index) {
        //如果传递的数组为空，则返回空指针异常,注意：空指针异常是运行期异常，无需自己处理
        if (arr==null){
            throw  new NullPointerException("该数组为空！！！");
        }
        //如果传递的索引值超过了数组的长度，则返会数组溢出异常
        else if (index<0||index>=arr.length)
        {
            throw new ArrayIndexOutOfBoundsException("数组溢出啦！！！");

        }
        else {

            int result = arr[index];
            return result;

        }



    }

}
