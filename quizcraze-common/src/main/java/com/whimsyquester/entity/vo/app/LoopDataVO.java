package com.whimsyquester.entity.vo.app;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.vo.app
 * @ClassName: LoopDataVO
 * @Datetime: 2023/11/20 04:19
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个泛型类，用于表示循环数据的视图对象
 */

public class LoopDataVO<T> {
    private T pre;
    private T current;
    private T next;

    public T getPre() {
        return pre;
    }

    public void setPre(T pre) {
        this.pre = pre;
    }

    public T getCurrent() {
        return current;
    }

    public void setCurrent(T current) {
        this.current = current;
    }

    public T getNext() {
        return next;
    }

    public void setNext(T next) {
        this.next = next;
    }
}

