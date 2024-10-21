#include <iostream>
#include <chrono>

class Stopwatch {
private:
    std::chrono::time_point<std::chrono::high_resolution_clock> startTime;
    std::chrono::time_point<std::chrono::high_resolution_clock> endTime;
    bool running;

public:
    Stopwatch() : running(false) {}

    void start() {
        if (!running) {
            startTime = std::chrono::high_resolution_clock::now();
            running = true;
        } else {
            std::cout << "Stopwatch is already running. Use stop() before starting again." << std::endl;
        }
    }

    void stop() {
        if (running) {
            endTime = std::chrono::high_resolution_clock::now();
            running = false;
        } else {
            std::cout << "Stopwatch is not running. Use start() before stopping." << std::endl;
        }
    }

    double getElapsedTimeInSeconds() {
        if (running) {
            auto now = std::chrono::high_resolution_clock::now();
            return std::chrono::duration<double>(now - startTime).count();
        } else {
            return std::chrono::duration<double>(endTime - startTime).count();
        }
    }

    double getElapsedTimeInMilliseconds() {
        return getElapsedTimeInSeconds() * 1000.0;
    }
};

int main() {
    Stopwatch stopwatch;
    
    stopwatch.start();
    // Simulate some work with a sleep
    std::this_thread::sleep_for(std::chrono::seconds(2));
    stopwatch.stop();

    std::cout << "Elapsed time: " << stopwatch.getElapsedTimeInMilliseconds() << " ms" << std::endl;

    return 0;
}
