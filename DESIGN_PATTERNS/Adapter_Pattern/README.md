# Adapter Pattern
The adapter pattern works as a bridge between two incompatible interfaces. This type of design pattern comes under a structural pattern as this pattern combines the capability of two independent interfaces.

This pattern involves a single class that is responsible to join functionalities of independent or incompatible interfaces. A real-life example could be a case of a card reader which acts as an adapter between a memory card and a laptop. You plug in the memory card into the card reader and card reader into the laptop so that memory cards can be read via laptop.

We are demonstrating the use of an Adapter pattern via the following example in which an audio player device can play mp3 files only and wants to use an advanced audio player capable of playing vlc and mp4 files.

### Implementation

We have a MediaPlayer interface and a concrete class AudioPlayer implementing the MediaPlayer interface. AudioPlayer can play mp3 format audio files by default.

We are having another interface AdvancedMediaPlayer and concrete classes implementing the AdvancedMediaPlayer interface. These classes can play vlc and mp4 format files.

We want to make AudioPlayer play other formats as well. To attain this, we have created an adapter class MediaAdapter which implements the MediaPlayer interface and uses AdvancedMediaPlayer objects to play the required format.

AudioPlayer uses the adapter class MediaAdapter passing it the desired audio type without knowing the actual class which can play the desired format. AdapterPatternDemo, our demo class will use the AudioPlayer class to play various formats.

![AdapterPatternDemo Workflow](https://www.tutorialspoint.com/design_pattern/images/adapter_pattern_uml_diagram.jpg)

### Step 1
Create interfaces (MediaPlayer.java, AdvancedMediaPlayer.java) for Media Player and Advanced Media Player.
### Step 2
Create concrete classes (VlcPlayer.java, Mp4Player.java) implementing the AdvancedMediaPlayer interface.
### Step 3
Create adapter (MediaAdapter.java) class implementing the MediaPlayer interface.
### Step 4
Create concrete class (AudioPlayer.java) implementing the MediaPlayer interface.
### Step 5
Use the AudioPlayer (AdapterPatternDemo.java) to play different types of audio formats.
### Output
```
Playing mp3 file. Name: beyond the horizon.mp3
Playing mp4 file. Name: alone.mp4
Playing vlc file. Name: far far away.vlc
Invalid media. avi format not supported
```








