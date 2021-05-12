package com.cucumber.samples.model;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookMappingStepDefinitions {

    private List<Book> books;

    private List<Book> filteredBooks;

    @Before
    public void setUp(){
        books = new ArrayList<>();
    }

    @Given("^Book details are provided$")
    public void givenBookDetailsProvided(DataTable dataTable){

        List<List<String>> rows = dataTable.asLists(String.class);

        for (List<String> row : rows) {
            books.add(new Book(row.get(0),row.get(1)));
        }

    }

    @When("I search for {string} Book")
    public void iSearchForThangavelBook(String bookName) {

        filteredBooks = books.stream()
                                  .filter(book -> book.getAuthor()
                                                      .equals(bookName))
                                  .collect(Collectors.toList());
    }


    @Then("I get {int} result sets")
    public void iGetResultSets(int count) {
        Assertions.assertEquals(count, filteredBooks.size());
    }

    @Given("Books and Author names are provided")
    public void booksAndAuthorNamesAreProvided(DataTable dataTable) {

        List<Map<String, String>> rowMaps = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> rowMap : rowMaps) {
            books.add(new Book(rowMap.get("title"), rowMap.get("author")));
        }
    }

    @When("I search book name for {string} book")
    public void iSearchBookNameForBook(String authorName) {
        filteredBooks = books.stream()
                                  .filter(b -> b.getAuthor()
                                                .equals(authorName))
                                  .collect(Collectors.toList());
    }

    @Then("I get {int} result books")
    public void iGetResultBooks(int count) {
        Assertions.assertEquals(count, filteredBooks.size());
    }
}
