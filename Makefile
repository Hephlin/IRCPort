CC=g++
CFLAGS=-c -Wall
LDFLAGS=-lws2_32
SOURCE_DIR=src
SOURCE_FILES=$(wildcard $(SOURCE_DIR)/*.cpp)
OBJECTS=$(SOURCE_FILES:.cpp=.o)
BUILD_DIR=bin
EXECUTABLE=ircclient.dll

all: $(SOURCE_FILES) $(EXECUTABLE)
	
$(EXECUTABLE): $(OBJECTS)
	$(CC) -o $@ $(OBJECTS) $(LDFLAGS)

.cpp.o:
	$(CC) $(CFLAGS) $< -o $@

clean:
	rm -rf $(SOURCE_DIR)/*.o $(EXECUTABLE)
