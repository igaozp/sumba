package com.github.igaozp.sumba.services

import com.intellij.openapi.project.Project
import com.github.igaozp.sumba.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
