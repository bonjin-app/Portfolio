package kr.co.bonjin.portfolio.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Arrays;
import java.util.List;

@Converter
public class StringListConverter implements AttributeConverter<List<String>, String> {

    private final String _SPLIT_CHAR = ",";

    /**
     * Entity -> DB
     */
    @Override
    public String convertToDatabaseColumn(List<String> attribute) {
        if (attribute == null) {
            return null;
        }

        return String.join(_SPLIT_CHAR, attribute);
    }

    /**
     * DB -> Entity
     */
    @Override
    public List<String> convertToEntityAttribute(String dbData) {
        if (dbData == null) {
            return null;
        }

        return Arrays.asList(dbData.split(_SPLIT_CHAR));
    }
}
