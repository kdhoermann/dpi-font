package com.github.kdhoermann.dpifont.services

import com.intellij.openapi.project.Project
import com.github.kdhoermann.dpifont.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
