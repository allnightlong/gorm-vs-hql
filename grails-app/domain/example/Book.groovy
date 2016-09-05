package example

class Book {
    String title
    String author
    Date dateCreated

    def beforeDelete() {
        println 'beforeDelete'
    }
}
