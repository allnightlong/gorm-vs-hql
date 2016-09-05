<g:each var="book" in="${books}">
    ${book.id}: ${book.title} <g:link action="deleteGorm" id="${book.id}">Del gorm</g:link> <g:link action="deleteHql" id="${book.id}">Del hql</g:link><br/>
</g:each>

<g:link action="new">New Book</g:link>
