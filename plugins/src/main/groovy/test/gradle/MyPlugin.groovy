package test.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println "hello, this is my custom plugin!"

        //执行自定义的  task
        project.task("TestPlugin"){
            doLast {
                println("buildSrc TestPlugin task 任务执行")
            }
        }
        println "test here!"
    }
}