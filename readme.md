## java-agent

提供了一个基于idea + maven构建java agent开发测试环境的项目，其中simple-agent子工程演示了一个hello world版本的java agent项目，并提供了两种打包方式，直接执行`build.sh`即可在target下获取到可用的agent包

app项目作为测试目标程序，同样提供了两种使用姿势，通过-jvm参数指定agent，以及通过attach方式挂载目标进程

更多详细内容，请参考博文:

- [200303-如何优雅的在java中统计代码块耗时](https://mp.weixin.qq.com/s/3cw3WsTUG94-C9894EBXUQ)
- [200316-IDEA + maven零基础构建java agent项目](https://blog.hhui.top/hexblog/2020/03/16/200316-IDEA-maven%E9%9B%B6%E5%9F%BA%E7%A1%80%E6%9E%84%E5%BB%BAjava-agent%E9%A1%B9%E7%9B%AE/)
- [200316-手把手教你实现一个方法耗时统计的java agent](https://blog.hhui.top/hexblog/2020/03/16/200316-%E6%89%8B%E6%8A%8A%E6%89%8B%E6%95%99%E4%BD%A0%E5%AE%9E%E7%8E%B0%E4%B8%80%E4%B9%AA%E6%96%B9%E6%B3%95%E8%80%97%E6%97%B6%E7%BB%9F%E8%AE%A1%E7%9A%84java-agent/)


