package com.thefuturemarine.ArmorModPlus.world;

import java.util.Random;

import com.thefuturemarine.ArmorModPlus.init.ArmorModBlocks;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ArmorModWorldGenerator implements IWorldGenerator {
	//@formatter:off

    private WorldGenerator gen_ruby_ore;
    private WorldGenerator gen_sapphire_ore;
    private WorldGenerator gen_amethyst_ore;
    private WorldGenerator gen_topaz_ore;
    private WorldGenerator gen_tanzanite_ore;
    private WorldGenerator gen_amber_ore;
    private WorldGenerator gen_netherrack_iron_ore;
    private WorldGenerator gen_netherrack_gold_ore;
    private WorldGenerator gen_netherrack_coal_ore;
    private WorldGenerator gen_netherrack_diamond_ore;
    private WorldGenerator gen_netherrack_lapis_ore;
    private WorldGenerator gen_netherrack_redstone_ore;
    private WorldGenerator gen_netherrack_emerald_ore;
    //@formatter:on

    public ArmorModWorldGenerator() {
    	
        this.gen_ruby_ore = new WorldGenMinable(ArmorModBlocks.ruby_ore.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
        this.gen_sapphire_ore = new WorldGenMinable(ArmorModBlocks.sapphire_ore.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
        this.gen_amethyst_ore = new WorldGenMinable(ArmorModBlocks.amethyst_ore.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
        this.gen_topaz_ore = new WorldGenMinable(ArmorModBlocks.topaz_ore.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
        this.gen_tanzanite_ore = new WorldGenMinable(ArmorModBlocks.tanzanite_ore.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
        this.gen_amber_ore = new WorldGenMinable(ArmorModBlocks.amber_ore.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
        this.gen_netherrack_iron_ore = new WorldGenMinable(ArmorModBlocks.netherrack_iron_ore.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.NETHERRACK));
        this.gen_netherrack_gold_ore = new WorldGenMinable(ArmorModBlocks.nethertack_gold_ore.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.NETHERRACK));
        this.gen_netherrack_coal_ore = new WorldGenMinable(ArmorModBlocks.netherrack_coal_ore.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.NETHERRACK));
        this.gen_netherrack_diamond_ore = new WorldGenMinable(ArmorModBlocks.netherrack_diamond_ore.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.NETHERRACK));
        this.gen_netherrack_lapis_ore = new WorldGenMinable(ArmorModBlocks.netherrack_lapis_ore.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.NETHERRACK));
        this.gen_netherrack_redstone_ore = new WorldGenMinable(ArmorModBlocks.netherrack_redstone_ore.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.NETHERRACK));
        this.gen_netherrack_emerald_ore = new WorldGenMinable(ArmorModBlocks.netherrack_emerald_ore.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.NETHERRACK));
    }
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()) {
            case 0: //OverWorld
                this.runGenerator(this.gen_ruby_ore, world, random, chunkX, chunkZ, 8, 0, 16);
                this.runGenerator(this.gen_sapphire_ore, world, random, chunkX, chunkZ, 7, 0, 15);
                this.runGenerator(this.gen_amethyst_ore, world, random, chunkX, chunkZ, 6, 0, 14);
                this.runGenerator(this.gen_topaz_ore, world, random, chunkX, chunkZ, 5, 0, 13);
                this.runGenerator(this.gen_tanzanite_ore, world, random, chunkX, chunkZ, 4, 0, 12);
                this.runGenerator(this.gen_amber_ore, world, random, chunkX, chunkZ, 7, 0, 12);

                break;
            case -1: //Nether
                this.runGenerator(this.gen_netherrack_iron_ore, world, random, chunkX, chunkZ, 15, 30, 135);
                this.runGenerator(this.gen_netherrack_gold_ore, world, random, chunkX, chunkZ, 10, 30, 135);
                this.runGenerator(this.gen_netherrack_coal_ore, world, random, chunkX, chunkZ, 25, 30, 135);
                this.runGenerator(this.gen_netherrack_diamond_ore, world, random, chunkX, chunkZ, 8, 30, 135);
                this.runGenerator(this.gen_netherrack_lapis_ore, world, random, chunkX, chunkZ, 13, 30, 135);
                this.runGenerator(this.gen_netherrack_redstone_ore, world, random, chunkX, chunkZ, 13, 30, 135);
                this.runGenerator(this.gen_netherrack_emerald_ore, world, random, chunkX, chunkZ, 5, 30, 135);
                break;
            case 1: //End

                break;
        }
    }

    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chancesToSpawn; i++) {
            int x = chunk_X * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunk_Z * 16 + rand.nextInt(16);
            generator.generate(world, rand, new BlockPos(x, y, z));
        }

    }
}

