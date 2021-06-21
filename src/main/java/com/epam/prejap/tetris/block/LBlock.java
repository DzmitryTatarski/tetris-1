package com.epam.prejap.tetris.block;

final class LBlock extends Block {

    private static final byte[][] IMAGE = {
            {1, 0},
            {1, 0},
            {1, 1},
    };

    public LBlock() {
        super(IMAGE);
    }

}
