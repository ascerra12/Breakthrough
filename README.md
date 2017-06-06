Breakthrough
Implementation of the game Breakthrough

TDD Process

First I created my BreakthroughImpl class, and J-unit test TestBreakthrough. I first started by reviewing the expectations for the code and started generating my first Test case, I started with a test to see if a black piece was where it should be on the board. After I wrote the test case I started to add code to the BreakthroughImpl class to try and get the test I wrote to pass. Once I had correctly implemented the getPieceAt method I went back to the test I had previously written and ran it. Once I saw that it passed I was able to write a test for the white colored piece and saw that it passed. I then moved on to the next thing that I needed to test which was to decide whose turn it was. I wrote a test to find this out, went back to my BreakthroughImpl class and wrote the necessary code to make the test run correctly. I returned to the test class and verified that the test worked. Once I had a few tests completed the BreakthroughImpl class was beginning to get larger so I returned to it and re-factored the code to make it easier on the eyes.

All of this code can be found under the files:
    BreakthroughImpl
    TestBreakthrough
