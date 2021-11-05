package com.sahikran.rss;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.sahikran.exception.RssReaderException;
import com.sahikran.model.RSSItem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @implNote 
 * 2. cleans the input stream for any unwated characters...
 * 3. Checks the encoding for existence of gZip and converts the gZipInputStream into inputStream
 * 4. 
 */
public class RssReaderFactory{

    private static final Logger log = LoggerFactory.getLogger(RssReaderFactory.class);

    public static Stream<RSSItem> readRssStream(InputStream inputStream) throws RssReaderException{
        Objects.requireNonNull(inputStream, "input stream can not be null");
        log.debug("reading input rss stream");

        RssReader<RSSItem> rssReader = (inp, rssIterator) -> {
            return StreamSupport.stream(Spliterators.spliteratorUnknownSize(rssIterator, Spliterator.ORDERED), false);
        };
        log.debug("calling rssReader read() to return RSSItem streams");
        return rssReader.read(inputStream, new RssItemIterator.Builder().build(inputStream));
    }
}
