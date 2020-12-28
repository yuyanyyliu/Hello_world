# Java随机数获取

## 方法一

直接使用Math.random()这个静态方法，random()方法返回一个<font color=red>[0,1)</font>的随机数

*(数据类型)（最小值 + Math.random()* **（最大值 - 最小值 + 1))*

```java
public class RandomValue {
    public static void main(String[] args) {
        int[] arry = new int[4];

        for(int i=0; i < arry.length; i++){
            arry[i] = (int) (Math.random()*(100 - 90 + 1) + 90); // [90,100)
        }
        for(int j=0; j < arry.length; j++){
            System.out.print(arry[j] + " ");
        }
    }
}
```

## 方法二

使用<font color=red>java.util.Random</font>类，创建一个实例，使用<font color=red>nextInt(int count)</font>获得count以内的整数，不含count