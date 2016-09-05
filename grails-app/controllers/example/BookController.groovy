package example

import static org.apache.commons.lang.RandomStringUtils.randomAlphabetic

class BookController {

    def index() {
        [books: Book.list()]
    }

    def 'new'() {
        new Book(title: randomAlphabetic(8), author: randomAlphabetic(8)).save(flush: true)
        redirect action: ' '
    }

    def deleteGorm(Long id) {
        Book.get(id).delete(flush: true)
        redirect action: ' '
    }

    def deleteCriteria(Long id) {
        Book.where {id == id}.deleteAll()
        redirect action: ' '
    }

    def deleteHql(Long id) {
        Book.executeUpdate('delete from Book where id = :id', [id: id])
        redirect action: ' '
    }
}
