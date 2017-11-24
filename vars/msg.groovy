def failed () {
    def commit = git.commitInfo()
    return "failed bcs of" +  commit.author
}