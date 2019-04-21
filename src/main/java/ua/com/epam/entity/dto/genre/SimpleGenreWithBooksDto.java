package ua.com.epam.entity.dto.genre;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.com.epam.entity.dto.book.SimpleBookDto;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SimpleGenreWithBooksDto {
    private Long genreId;
    private String genreName;
    private List<SimpleBookDto> books;
}