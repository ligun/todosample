import todo.Todo

class BootStrap {

    def init = { servletContext ->
        environments {
            development {
                new Todo(content: "ほげほげ").save()
                new Todo(content: "ふがふが").save()
                new Todo(content: "ぴよぴよ").save()
            }
        }
    }
    def destroy = {
    }
}
