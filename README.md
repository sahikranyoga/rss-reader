# RSS Reader or Parser
 This is a Java library to read RSS feed from a file and makes the data extraction easier from an RSS 2.0.0 and later. This utilizes Java Stream API and retrieves java Stream by reading an input RSS file stream.

 This library accepts an input file stream of an RSS feed allowing developers choose any available option to read an external web URL in order to provide an input stream. 
 For example, libraries such as Apache HttpClient can be used to read a web URL that provides an RSS feed.

## Usage
### Read RSS feed
Reads from a RSS (or Atom) feeds and extract all items that contains the word yoga in the title. 
```java
Stream<RSSItem> rssFeed = RssReaderFactory.readRssStream(inputStream);
List<Item> feedItems = rssFeed.filter(i -> i.getTitle().equals(Optional.of("yoga")))
                             .collect(Collectors.toList());
```

## Download

Download [the latest JAR][1] or grab via [Maven][2] or [Gradle][3].

### Maven setup

### Gradle setup

## License

    MIT License
    
    Copyright (c) 2020, Apptastic Software
    
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.

