def failed () {
    def commit = git.commitInfo()

    def commitText = """Last commit by *${commit.author}*
                        | ${commit.message}
                        | ${commit.time}
                         """.stripMargin()

    return "Build *<${currentBuild.absoluteUrl}|${currentBuild.fullDisplayName}>* failed \n" + commitText
}