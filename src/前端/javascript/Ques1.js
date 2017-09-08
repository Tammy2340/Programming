/**
 * Created by apple on 2017/8/23.
 *
 * 题目描述
 * 
 * 封装函数 f，使 f 的 this 指向指定的对象
 * 
 */

function bindThis(f,oTarget) {
    this.f(oTarget);
    function f(target) {

    }
}