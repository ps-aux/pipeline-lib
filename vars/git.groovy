class CommitInfo implements Serializable {

    public String author
    public String message
    public String time

}

def commitInfo () {
    def c = new CommitInfo()
    c.author = gitInfo('%an')
    c.message = gitInfo('%s')
    c.time = gitInfo('%cr')

    return c
}

def gitInfo (format) {
    return  sh(returnStdout: true,
            script: "git --no-pager show -s --format=${format}").trim()

}