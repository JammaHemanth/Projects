import speech_recognition as sr
r = sr.Recognizer()

with sr.Microphone() as source:
                    print("Say something")
                    audio = r.listen(source)

try:
        text = r.recognize_google_cloud(audio)
        print("You said: {}".format(text))
except:
        print("Please try again.......")        