package com.github.alexandrsergei4.unloader.services

import com.intellij.openapi.project.Project
import com.github.alexandrsergei4.unloader.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
