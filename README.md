# Jurassic Park Security Interface

## Project Video URL

https://youtu.be/3tPPe_VXUqg

## Overview

This project is my CS50 final project. It is a Java-based recreation of the iconic scene from *Jurassic Park (1993)* where Samuel L. Jackson’s character attempts to access the park’s computer system, only to be denied access by Dennis Nedry’s infamous “You didn’t say the magic word!” prank.  

The program uses Java Swing to simulate a retro-style terminal window, combined with animated GIFs and sound effects to faithfully recreate the experience. The goal of this project was both to learn more about Java’s graphical libraries and audio APIs, and to apply fundamental programming concepts—loops, conditionals, event handling—in a fun and creative way.

---

## Features

- **Text-based terminal simulation**:  
  The application opens a custom terminal-like window (`JTextArea`) styled with monospaced fonts, dark backgrounds, and system-like prompts.

- **User input handling**:  
  Users can type commands directly into the terminal. After three incorrect attempts, the program transitions to the “magic word” loop.

- **GIF animation**:  
  A popup window displays a looping animated GIF of Dennis Nedry taunting the user.

- **Audio integration**:  
  Two `.wav` files are used:
  1. *Magic Word Line*: Nedry’s voice saying *“Ah ah ah, you didn’t say the magic word!”* plays once as the GIF appears.
  2. *Laughing Loop*: A continuous background of Nedry’s laugh plays on repeat.

- **Scrolling output**:  
  The terminal continuously appends “YOU DIDN’T SAY THE MAGIC WORD!” while auto-scrolling downwards, simulating an unstoppable spam of text.

---

## Technical Details

### Technologies
- **Language**: Java (17+)
- **GUI Toolkit**: Swing (`JFrame`, `JTextArea`, `JScrollPane`, `JLabel`)
- **Audio**: `javax.sound.sampled` (using `Clip`, `AudioInputStream`)
- **Build/IDE**: IntelliJ IDEA

### Structure
- `Main.java` – Handles the GUI window, terminal setup, and input logic.
- `GifLoop.java` – Controls the infinite text loop and triggers the animated GIF.
- `SoundPlayer.java` – Utility class to handle audio playback, both one-time and looping.
- `/resources` – Contains all non-code assets, such as GIFs and `.wav` files.

---

## Challenges

This project involved several challenges:

1. **User input in JTextArea**  
   Instead of using a separate `JTextField`, I wanted the user to type directly inside the terminal area. Achieving this required custom key listeners, cursor control, and prompt management.

2. **Timing and synchronization**  
   Coordinating the delays between “PERMISSION DENIED...and...” → starting the infinite text loop → showing the GIF → playing the audio sequence was tricky. Threads (`new Thread()`) and `Thread.sleep()` were essential tools.

3. **Resource loading**  
   Ensuring the `.gif` and `.wav` files worked correctly both in IntelliJ and when packaged as a JAR required correct use of `getResource()` and keeping a proper `/resources` structure.

4. **Audio playback**  
   Looping the “ah ah ah” laugh with pauses between repeats required customizing the playback logic rather than just using `clip.loop()`.

---

## Lessons Learned

Through this project, I learned:

- How to build GUIs in Java with Swing.
- How to capture and process keyboard events inside a GUI component.
- How to structure a project with multiple helper classes (`GifLoop`, `SoundPlayer`).
- How to integrate external resources (images, audio) into a Java program.
- The importance of separating concerns: one class for GUI logic, one for audio, one for looping behaviors.
- The basics of GitHub workflow (branches, pull requests, merges).

---

## Usage

1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/jurassic-terminal.git

