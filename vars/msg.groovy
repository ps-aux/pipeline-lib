def failed () {
    def commit = git.commitInfo()

    def commitText = """Last commit by *${commit.author}*
                        | `${commit.message}`
                        | ${commit.time}
                         """.stripMargin()

    return "*<${currentBuild.absoluteUrl}|${currentBuild.fullDisplayName}>* build failed \n" + commitText
}