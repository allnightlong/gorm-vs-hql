<g:each var="book" in="${books}">
    ${book.id}: ${book.title}
    <g:link action="deleteGorm" id="${book.id}">Delete gorm</g:link>
    <g:link action="deleteCriteria" id="${book.id}">Delete criteria</g:link>
    <g:link action="deleteHql" id="${book.id}">Delete hql</g:link>
    <br/>
</g:each>

<g:link action="new">New Book</g:link>
