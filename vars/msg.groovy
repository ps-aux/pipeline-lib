def failed () {
    def commit = git.commitInfo()

    def commitText = """Last commit by *${commit.author}*
                        | ${commit.message}
                        | ${commit.time}
                         """

    return "Build *<${currentBuild.absoluteUrl}|${currentBuild.fullDisplayName}>* failed \n." + commitText
}