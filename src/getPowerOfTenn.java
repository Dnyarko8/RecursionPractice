
public long getPowerOfTenn(int n) {
    long result = 1;

    for (int i = 0; i < n; i++) {
        result = result * 10;
    }

    return result;
}

void main() {
}
